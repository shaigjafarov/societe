package test.date;

public enum Aylar {

    FEVRAL(2),

    YANVAR(1),

    MART(3),

    APREL;



    private int order;

    Aylar(int order) {
        this.order = order;
    }

    Aylar() {
    }
}

class Ma{

    public static void main(String[] args) {
        Aylar.FEVRAL.ordinal();
    }

}
