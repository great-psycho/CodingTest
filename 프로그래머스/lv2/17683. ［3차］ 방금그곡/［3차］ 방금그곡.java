class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        m = changeMelody(m);
        int maxTime = -1;

        for(String musicinfo : musicinfos){
            String[] music = musicinfo.split(",");
            int time = cutTime(music);
            String title = music[2];
            String melody = changeMelody(music[3]);
            while (melody.length() < time){
                melody += melody;
            }
            String[] a = melody.split("");
            
            StringBuilder realmelody = new StringBuilder();
            for(int i=0; i<time; i++){
                realmelody.append(a[i]);
            }
            melody = realmelody.toString();

            if (melody.contains(m) && time>maxTime) {
                answer = title;
                maxTime = time;
            }
            System.out.println(melody);
        }
        if (answer.equals("")) answer = "(None)";
        return answer;
    }

    int cutTime(String[] music) {
        String[] time1 = music[0].split(":");
        String[] time2 = music[1].split(":");
        int start = Integer.parseInt(time1[0])*60 + Integer.parseInt(time1[1]);
        int end = Integer.parseInt(time2[0])*60 + Integer.parseInt(time2[1]);
        return end - start;
    }
    String changeMelody(String s) {
        s = s.replaceAll("C#","Q");
        s = s.replaceAll("D#","W");
        s = s.replaceAll("F#","Y");
        s = s.replaceAll("G#","R");
        s = s.replaceAll("A#","T");
        return s;
    }
}