package controller;

import model.Cachorro;
import service.CachorroService;
import view.CadastroCachorroView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CachorroController {
    private CadastroCachorroView view;
    private CachorroService service;

    public CachorroController(CadastroCachorroView view, CachorroService service) {
        this.view = view;
        this.service = service;
        this.view.getCadastrarButton().addActionListener(new CadastrarAction());
        this.view.getCancelarButton().addActionListener(new CancelarAction());
    }

    private class CadastrarAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNomeField().getText();
            String dataStr = view.getDataField().getText();
            String tipoRaca = view.getTipoRacaField().getText();
            
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Nome do cachorro é obrigatório.");
                return;
            }
            if (!validarData(dataStr)) {
                JOptionPane.showMessageDialog(view, "Data de nascimento inválida.");
                return;
            }
            if (tipoRaca.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Tipo de raça é obrigatório.");
                return;
            }
            
            Cachorro cachorro = new Cachorro(nome, parseData(dataStr), tipoRaca);
            service.cadastrarCachorro(cachorro);
            JOptionPane.showMessageDialog(view, "Cadastro realizado com sucesso!");
        }
    }

    private class CancelarAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
        }
    }

    private boolean validarData(String dataStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date data = sdf.parse(dataStr);
            return !data.after(new Date());
        } catch (Exception e) {
            return false;
        }
    }

    private Date parseData(String dataStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(dataStr);
        } catch (Exception e) {
            return null;
        }
    }
}