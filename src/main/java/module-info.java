module sujan.smiles.javafxtraining {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens sujan.smiles.javafxtraining to javafx.fxml;
    exports sujan.smiles.javafxtraining;
    exports sujan.smiles.javafxtraining.layouts;
    opens sujan.smiles.javafxtraining.layouts to javafx.fxml;
}