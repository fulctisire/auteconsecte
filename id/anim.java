public class LoremIpsumGenerator {

    // Default set of words to generate the Lorem Ipsum text.
    private static final String[] WORD_LIST = {
        "lorem", "ipsum", "dolor", "sit", "amet", "consectetur", 
        "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", 
        "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua"
    };

    // Generates a paragraph of Lorem Ipsum text.
    public String generateParagraph(int wordCount) {
        if (wordCount <= 0) {
            return ""; // Return an empty string if word count is not positive.
        }

        StringBuilder loremIpsumText = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            loremIpsumText.append(WORD_LIST[i % WORD_LIST.length]);
            if (i < wordCount - 1) {
                loremIpsumText.append(" "); // Add space between words.
            }
        }

        loremIpsumText.append("."); // End the paragraph with a period.
        return loremIpsumText.toString();
    }
}
