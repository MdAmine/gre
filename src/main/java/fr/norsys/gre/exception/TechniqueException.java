package fr.norsys.gre.exception;

/**
 * Exception représentant toute erreur technique (Accès BDD, Appels Externes,
 * ...) pour une gestion unique des erreurs.
 *
 * @author Saoud Mohamed Amine
 */
public class TechniqueException extends Exception {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 3986981915307021770L;

    /**
     * Constructeur portant un message et une cause.
     *
     * @param message Le message identifiant l'erreur au niveau de Galaad.
     * @param cause L'exception à l'origine de l'erreur technique.
     */
    public TechniqueException(String message, Throwable cause) {

        super(message, cause);
    }

    /**
     * Constructeur portant un message et une cause.
     *
     * @param message Le message identifiant l'erreur au niveau de Galaad.
     */
    public TechniqueException(String message) {

        super(message);
    }

}
