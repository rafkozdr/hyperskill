class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();
        for (int i = 65; i < 91; i++) {
            alphabet.append((char) i + " ");
        }

        alphabet.deleteCharAt(alphabet.length() - 1);
        return alphabet;
    }
}