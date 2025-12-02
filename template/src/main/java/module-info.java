module fr.<VotreNomDeGroupe>.<NomDeVotreApp> {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    requires java.net.http;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires itextpdf;
    requires jbcrypt;

    exports fr.<VotreNomDeGroupe>.<NomDeVotreApp>;

    opens fr.<VotreNomDeGroupe>.<NomDeVotreApp> to javafx.fxml;
    opens fr.<VotreNomDeGroupe>.<NomDeVotreApp>.controller to javafx.fxml;

    opens fr.<VotreNomDeGroupe>.<NomDeVotreApp>.model to jakarta.persistence, org.hibernate.orm.core;
}
