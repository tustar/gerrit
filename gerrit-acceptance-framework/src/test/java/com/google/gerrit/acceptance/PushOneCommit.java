import static org.junit.Assert.assertEquals;
  public static final String PATCH_FILE_ONLY =
  public static final String PATCH =
      "From %s Mon Sep 17 00:00:00 2001\n" +
      "From: Administrator <admin@example.com>\n" +
      "Date: %s\n" +
      "Subject: [PATCH] test commit\n" +
      "\n" +
      "Change-Id: %s\n" +
      "---\n" +
      "\n" + PATCH_FILE_ONLY;
  private List<String> pushOptions;
    return new Result(ref,
        pushHead(testRepo, ref, tag != null, force, pushOptions), c, subject);
  public List<String> getPushOptions() {
    return pushOptions;
  }

  public void setPushOptions(List<String> pushOptions) {
    this.pushOptions = pushOptions;
  }

    public void assertPushOptions(List<String> pushOptions) {
      assertEquals(pushOptions, getPushOptions());
    }

        throws OrmException {
        throws OrmException {