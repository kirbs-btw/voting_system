class Candidate extends Person{
    public Candidate(int id, float ... a){
        //Random random = new Random();
        // opinionA = random.nextFloat(-1, 1);
        //opinionB = random.nextFloat(-1, 1);
        // opinionA = a;
        // opinionB = b;
        num = id;
        for (float opinion : a){
            opinions.add(opinion);
        }

    }
}