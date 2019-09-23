package com.dey.controller;

import com.dey.entity.Category;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class categorymanagement implements Initializable {


  public TextField txtid;
  public TextField txtnama;
  public Button actionSave;
  public TableColumn<Category,String> col01;
  public TableColumn<Category,String>col02;
  public ModulController modulController;
  public TableView tablemanagement;

  public void setActionSave(Button actionSave) {
    this.actionSave = actionSave;
  }
  private void actionSave(ActionEvent actionEvent) {
    Category f = new Category();
    f.setCategoryname(txtid.getText().trim());
    f.setCategoryname(txtnama.getText());
//        faculties.add(f);)
  }
  private void tableClicked(MouseEvent mouseEvent){
    Category f = (Category) tablemanagement.getSelectionModel().getSelectedItem();
    txtid.setText(f.getCategoryname());
    txtnama.setText(f.getCategoryname());
  }
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    col01.setCellValueFactory(data-> {
      Category f = data.getValue();

      return new SimpleStringProperty(f.getCategoryname());
    });

  }
  public void setModulController(ModulController modulController) {
    this.modulController = modulController;
  }
}
