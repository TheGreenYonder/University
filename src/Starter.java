import java.util.ArrayList;
import java.util.Date;

public class Starter {
    public static void main(String[] args) {

        // --------- STUDENTEN ------------- \\
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            students.add(new Student());
        }

        students.get(0).MatNr = 1002345;
        students.get(1).MatNr = 1004333;
        students.get(2).MatNr = 1000031;
        students.get(3).MatNr = 1002375;

        students.get(0).Name = "Gerd Müller";
        students.get(1).Name = "Linda Edler";
        students.get(2).Name = "Marius Kahn";
        students.get(3).Name = "Gerda Schulze";

        students.get(0).Immat = new Date(2009, 9, 15);
        students.get(1).Immat = new Date(2011, 9, 17);
        students.get(2).Immat = new Date(2008, 9, 14);
        students.get(3).Immat = new Date(2009, 9, 15);


        // ----------- VORLESUNGEN ------------------- \\

        ArrayList<Vorlesung> lecture = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lecture.add(new Vorlesung());
        }

        lecture.get(0).VorlNr = 2203;
        lecture.get(1).VorlNr = 2100;
        lecture.get(2).VorlNr = 1899;

        lecture.get(0).Name = "Höhere Mathematik";
        lecture.get(1).Name = "Informatik";
        lecture.get(2).Name = "Fußball";

        lecture.get(0).SWS = 8;
        lecture.get(1).SWS = 12;
        lecture.get(2).SWS = 1;


        // ----------- PROFESSOR --------------- \\

        ArrayList<Professor> prof = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            prof.add(new Professor());
        }

        prof.get(0).Rang = "Genie";
        prof.get(1).Rang = "Professor";

        prof.get(0).Name = "Ulf Maier";
        prof.get(1).Name = "Sepp Maier";

        prof.get(0).PersNr = 223;
        prof.get(1).PersNr = 334;


        // ----------- ADDISTENT --------------- \\

        ArrayList<Assistent> assistant = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            assistant.add(new Assistent());
        }

        assistant.get(0).Promotionsgebiet = "Künstliche Intelligenz";
        assistant.get(1).Promotionsgebiet = "Angriff ohne Stürmer";

        assistant.get(0).Name = "Mini Michel";
        assistant.get(1).Name = "Jupp Schlegel";

        assistant.get(0).PersNr = 1233;
        assistant.get(1).PersNr = 1289;

    }
}
