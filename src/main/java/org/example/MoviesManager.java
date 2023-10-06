package org.example;
public class MoviesManager {
    private String[] movies = new String[0];
    private int limit = 5;

    public MoviesManager(int limit) {
        this.limit = limit;
    }
    public MoviesManager(){
    }

    public void addMovie(String newMovie) {
        String[] newMasiv =new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMasiv[i] = movies[i];
        }
        newMasiv[newMasiv.length - 1] = newMovie;
        movies = newMasiv;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < movies.length) {
            resultLength = limit;
        }
        else {
            resultLength = movies.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 -i];
        }
        return result;
    }

}
