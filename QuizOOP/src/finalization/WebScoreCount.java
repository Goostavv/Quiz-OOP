/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalization;

import Form.Registration;
import Form.elimination;
/**
 *
 * @author Gustav
 */
public class WebScoreCount extends Registration implements elimination {
  public WebScoreCount(String nik, String name, double Writingscore, double Codingscore, double Interviewscore) {
        super(nik, name, Writingscore, Codingscore, Interviewscore);
    }
    
    @Override
    public double eliminateWriting() {
        return this.Writingscore * 0.4;
    }

    @Override
    public double eliminateCoding() {
        return this.Codingscore * 0.35;
    }

    @Override
    public double eliminateInterview() {
        return this.Interviewscore * 0.25;
    }
}
