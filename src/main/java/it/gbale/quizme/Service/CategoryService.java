package it.gbale.quizme.Service;

import it.gbale.quizme.Entity.Category;
import it.gbale.quizme.Exception.InvalidEntityException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    public Category saveNewCategory(Category category) throws InvalidEntityException {
        // TODO: Salvare una nuova categoria
        if(true){
            return new Category();
        }
        throw new InvalidEntityException();
    }

    public void deleteCategory(String category) throws InvalidEntityException {
        // TODO: Eliminare una categoria
    }

    public void deleteCategory(String category, Boolean deleteAll) throws InvalidEntityException {
        // TODO: Eliminare tutte le categorie
    }

    public Category modifyCategory(String uuid, Category category) throws InvalidEntityException {
        // TODO: Modificare una categoria
        return new Category();
    }

    public List<Category> getListCategory(String category) {
        // TODO: Lista di tutte le categorie disponibili
        return new ArrayList<Category>();
    }
}
