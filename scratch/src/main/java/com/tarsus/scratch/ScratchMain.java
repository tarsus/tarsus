package com.tarsus.scratch;

public class ScratchMain {
    public static void main(String[] args) {
        new test().run();
    }

    private static class test {
        public void run() {

            Post post = new Post();
            post.set_text("this is the first post");

            User justine = new User();
            justine.set_name("justine");

            post.set_author(justine);

            System.out.println(justine.get_name() + ": " + post.get_text());
        }
    }
}
