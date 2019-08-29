package fr.java12.feature.switchs;

class Switch {

    String getGradeUsingOldSwitch(char note){
        String grade;
        switch (note){
            case 'A':
                grade = "Excellent";
                break;
            case 'B':
            case 'C':
                grade = "Well done";
                break;
            case 'D':
                grade = "Passed";
                break;
            case 'F':
                grade = "Try again";
                break;
            default:
                grade = "Invalid";
                break;
        }
        return grade;
    }

    /**
     * Today a switch expression is a preview feature, available in openJdk-12 but not yet permanent
     * @param note
     * @return a grade
     */
    String getGradeUsingSwitchExpression(char note){
       return switch (note) {
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Well done";
            case 'D' -> "Passed";
            case 'F' -> "Try again";
            default -> "Invalid";
        };
    }
}
