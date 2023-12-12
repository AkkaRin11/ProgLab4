package org.example.entity;

public class Flowers extends Entity{
    private String specifications = "жёлтые, красные, голубые";

    public void printSpecifications(){
        System.out.print(" " + specifications);
    }

    public void lookThrough(String what){
        System.out.print(" они проглядвали сквозь " + what);
    }

    public void pullStemsTowardsSun(){
        Stems.pull("солнцу");
    }

    private static class Stems{
        public static void pull(String what){
            System.out.print(" тянули свои стебельки к " + what);
        }
    }


    @Override
    public String toString() {
        return "цветы";
    }

    @Override
    public int hashCode() {
        int result = "цветы".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
