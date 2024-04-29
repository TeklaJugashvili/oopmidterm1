package midterm.tekla_jugashvili_1.task1;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String teklajugashvili;

    public Fantasy(String teklajugashvili) {
        this.studentName = teklajugashvili;}

        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("Fantasy Details:\n");
            result.append("Student Name: ").append(studentName).append("\n");
            result.append("Fantasy Type: ").append(getFantasyType()).append("\n");
            result.append("Fantasy Rating: ").append(getFantasyRating()).append("\n");
            result.append("Dream Location: ").append(getDreamLocation()).append("\n");
            result.append("Dream Duration: ").append(getDreamDuration()).append(" hours\n");
            return result.toString();
        }
        
        public String getFantasyType() {
            return "Unknown Fantasy Type";
        }
        public int getFantasyRating() {
            return 0;
        }
    
        public String getDreamLocation() {
            return "Unknown Dream Location";
        }
    
        public int getDreamDuration() {
           return 0;
        
    }
}

    
