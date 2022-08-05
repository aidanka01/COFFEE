public enum Coffee {
    SMALL(200){
        @Override
        public void size() {
            System.out.println("Small coffee is " + this.getSize() + "mg" );
        }
    },
    MEDIUM(400){
        @Override
        public void size() {
            System.out.println("Medium coffee is " + this.getSize() + "mg");
        }
    },
    LARGE(600){
        @Override
        public void size() {
            System.out.println("Large coffee is " + this.getSize() + "mg");
        }
    };

    private final int size;


    Coffee(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract void size ();
}
