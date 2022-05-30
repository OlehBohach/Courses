class Work<T, S, O> {
    private T[] group1;
    private S[] group2;

    Work(T[] group1, S[] group2) {
        this.group1 = group1;
        this.group2 = group2;
    }

    private O[] mix() {
        StringBuilder outString = new StringBuilder();
        for (int i=0; i< group1.length && i < group2.length; i++) {
            outString.append(group1[i]).append(";").append(group2[2]).append(";");
        }
        return (O[]) outString.toString().split(";");
    }

    public O[] getOut() {
        return mix();
    }
}
