package proiect.computer;

class ComputerNotFoundException extends RuntimeException {

    ComputerNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}