import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HistoryManagerTest {
    @Test
    public void add() {
        HistoryManager historyManager = Managers.getDefaultHistory();
        Task task = new Task("Task", "Description");
        historyManager.add(task);
        List<Task> history = historyManager.getHistory();
        assertNotNull(history, "История не должна быть пустой.");
        assertEquals(1, history.size(), "История должна содержать одну задачу.");
    }
}