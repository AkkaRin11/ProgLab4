package org.example.entity;

public class Copybook extends Entity{

    private final Cover cover;
    public final Page page;
    private String text;

    public Copybook(){

    }

    public void addTextToBook(String text){
        this.text += "\n" + text;
    }

    {
        cover = new Cover();
        page = new Page();
    }

    @Override
    public String toString() {
        return "тетрадка c " + cover;
    }

    private class Page extends Entity{

        @Override
        public String toString() {
            return "страница";
        }
    }

    @Override
    public int hashCode() {
        int result = cover == null ? 0 : cover.hashCode();
        result = 31 * result + page.hashCode();
        result = 31 * result + text.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Copybook that = (Copybook) o;

        if (cover != that.cover) return false;
        if (text != that.text) return false;
        return page == that.page;
    }
}
