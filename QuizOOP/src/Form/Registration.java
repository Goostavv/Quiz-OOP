/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Gustav
 */
public class Registration implements elimination {

    String nik;
    String name;
    public double Writingscore;
    public double Codingscore;
    public double Interviewscore;

    public Registration(String nik, String name, double Writingscore, double Codingscore, double Interviewscore) {
        this.nik = nik;
        this.name = name;
        this.Writingscore = Writingscore;
        this.Codingscore = Codingscore;
        this.Interviewscore = Interviewscore;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWritingscore() {
        return Writingscore;
    }

    public void setWritingscore(double Writingscore) {
        this.Writingscore = Writingscore;
    }

    public double getCodingscore() {
        return Codingscore;
    }

    public void setCodingscore(double Codingscore) {
        this.Codingscore = Codingscore;
    }

    public double getInterviewscore() {
        return Interviewscore;
    }

    public void setInterviewscore(double Interviewscore) {
        this.Interviewscore = Interviewscore;
    }

    
    @Override
    public double eliminateWriting() {
    return 0;
    }

    @Override
    public double eliminateCoding() {
    return 0;
    }

    @Override
    public double eliminateInterview() {
    return 0;
    }
    
}
