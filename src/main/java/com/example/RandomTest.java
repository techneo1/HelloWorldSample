public String genRandom() {
    RandomStringGenerator randomStringGenerator = new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .filteredBy(Character::isLetterOrDigit)
            .build();

    String randomAlphanumericString = randomStringGenerator.generate(10);
    return randomAlphanumericString;
}