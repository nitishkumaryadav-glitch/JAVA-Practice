class Feedback {
    private int rating;
    private String comment;

    public Feedback(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}

class Analyzer {

    public void analyze(Feedback[] feedbacks) {

        int total = 0;

        for (Feedback f : feedbacks) {
            total += f.getRating();
        }

        double average = (double) total / feedbacks.length;

        System.out.println("Average Rating: " + average);

        int category = (int) average;

        switch (category) {
            case 5:
                System.out.println("Sentiment: Excellent");
                break;
            case 4:
                System.out.println("Sentiment: Good");
                break;
            case 3:
                System.out.println("Sentiment: Average");
                break;
            case 2:
                System.out.println("Sentiment: Poor");
                break;
            default:
                System.out.println("Sentiment: Very Poor");
        }

        System.out.println("\nCustomer Reviews:");
        for (Feedback f : feedbacks) {
            System.out.println(f.getRating() + " - " + f.getComment());
        }
    }
}

public class feedback {

    public static void main(String[] args) {

        Feedback[] feedbacks = {
            new Feedback(5, "Excellent Service"),
            new Feedback(4, "Good Product"),
            new Feedback(3, "Average Experience"),
            new Feedback(5, "Very Satisfied"),
            new Feedback(4, "Nice Support")
        };

        Analyzer analyzer = new Analyzer();
        analyzer.analyze(feedbacks);
    }
}