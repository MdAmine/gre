package fr.norsys.gre.dao.mapper;

/**
 * Mapper parent qui fournit les méthodes classiques du CRUD.
 *
 * @author SAOUD Mohamed Amine
 * @param <T> Le model géré par ce Mapper.
 */
public abstract interface Mapper<T> {

    /**
     * Crée un objet model.
     *
     * @param model Le model à créer.
     * @return Le model crée avec son identifiant technique.
     */
    int create(T model);

    /**
     * Récupère un objet model grâce à son identifiant technique.
     *
     * @param id L'identifiant technique du model.
     * @return Le model recherché.
     */
    T getById(Long id);

    /**
     * Met à jour un objet model.
     *
     * @param model Le model à mettre à jour.
     */
    void update(T model);

    /**
     * Supprime un objet model.
     *
     * @param model Le modèle à supprimer.
     */
    void delete(T model);
}
