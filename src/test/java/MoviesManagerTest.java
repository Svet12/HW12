import org.example.MoviesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoviesManagerTest {
    @Test
    public void testFindAll() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitBiggerSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";
        String movie6 = "тролли. Мировой тур";
        String movie7 = "Номер один";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitBiggerSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(4);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(6);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентльмены";
        String movie5 = "Чуловек-невидимка";
        String movie6 = "тролли. Мировой тур";
        String movie7 = "Номер один";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};

        Assertions.assertArrayEquals(expected, actual);
    }

}
