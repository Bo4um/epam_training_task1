package search;

import java.util.List;

import models.Sweets;

public interface Search {
    List<Sweets> search(double from, double before);
}
