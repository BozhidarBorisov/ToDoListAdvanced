import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private String description;
    private String dueDate;
    private String status;

    public Task(String title, String description, String dueDate) {
        setTitle(title);
        setDescription(description);
        setDueDate(dueDate);
        this.status = "Incomplete";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.trim().equals("")){
            throw new IllegalArgumentException("Title must not be empty!");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.trim().equals("")){
            throw new IllegalArgumentException("Description must not be empty!");
        }
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        if (dueDate.trim().equals("")){
            throw new IllegalArgumentException("Due Date must not be empty!");
        }
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();;
        sb.append("Title: "+title).append(System.lineSeparator());
        sb.append("Description: "+description).append(System.lineSeparator());
        sb.append("Due Date: "+ dueDate).append(System.lineSeparator());
        return sb.toString().trim();
    }
}
