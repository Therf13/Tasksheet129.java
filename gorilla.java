public class gorilla implements Animal{

    @Override
    public void groom() {
        System.out.println ("lather, rinse, repeat");
    }

    public void pet() {
        System.out.println ("pet at your own risk");
    }

    @Override
    public boolean feed(boolean timeToEat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feed'");
    }

}