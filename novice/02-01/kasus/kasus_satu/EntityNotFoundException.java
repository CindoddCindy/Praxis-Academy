public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }

    public static void main(String [] args){
        EntityNotFoundException entityNotFoundException= new EntityNotFoundException(message);
        entityNotFoundException.addSuppressed(exception);
    }
}