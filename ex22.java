class BookNotAvailableException extends Exception {
    BookNotAvailableException(String s) {
        super(s);
    }
}

class ex22 {
    int availableBooks = 3;

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }

    public static void main(String[] args) {
        ex22 l = new ex22();
        try {
            l.issueBook(2);
            l.issueBook(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}