package com.drone.application.gui.utils;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The DataSource class is a utility class to
* create a DataSource to be used in GUI.
* 
* Needs to be modified later, bad logic!!!!!
* 
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* ------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import java.io.IOException;
import java.util.ArrayList;

public class DataSource {
    
    private String file;
    /*
        Communication parameters
    */
    private int numberOfSendToAutopilot;
    private int numberOfSendToOthers;
    private int numberOfSendEndMission;
    private int serialOrUDP;
    private String COMport;
    private int COMrate;
    private int COMtimeOut;
    
    ArrayList<Integer> CommunicationParams;

    /*
        Scenario parameters
    */
    private int numberOfAircraft; 
    private int numberOfTarget;
    private long DtStart;
    private long DtSend;
    private double captureDistance;              
    private double altitudeBand;
    private long targetFlyOverTime;
    private double horSpeed;                       
    private double minFlightAltitude;             
    private double deltaAltitude;
    
    ArrayList<Double> ScenarioParams;
    
    /*
        Algorithm parameters
    */
    private int numberOfNeg;                    
    private long dtNeg;           
    private long dtNegCicle;             
    private long planningTime;
    private long dtAlgorithm;                  
    private int algMaxLine;                      
    private int algMaxCol;                     
    private double eciCost;                   
    private double beta;
    
    ArrayList<Double> AlgorithmParams;
    
    /*
        Target
    */
    public double takeofflat;
    public ArrayList<Integer> getDrones() {
		return drones;
	}

	public void setDrones(ArrayList<Integer> drones) {
		this.drones = drones;
	}

	public double takeofflon;
    
    private double T1latOwnDeg;
    private double T2latOwnDeg;
    private double T3latOwnDeg;
    private double T4latOwnDeg;
    private double T5latOwnDeg;
    private double T6latOwnDeg;
    private double T7latOwnDeg;
    private double T8latOwnDeg;
        
    private double T1lonOwnDeg;
    private double T2lonOwnDeg;
    private double T3lonOwnDeg;
    private double T4lonOwnDeg;
    private double T5lonOwnDeg;
    private double T6lonOwnDeg;
    private double T7lonOwnDeg;
    private double T8lonOwnDeg;
    
    ArrayList<String> TargetParams;
    
    ArrayList<Integer> drones;
    
    public int getNumberOfSendToAutopilot() {
        return numberOfSendToAutopilot;
    }

    public void setNumberOfSendToAutopilot(int numberOfSendToAutopilot) {
        this.numberOfSendToAutopilot = numberOfSendToAutopilot;
    }

    public int getNumberOfSendToOthers() {
        return numberOfSendToOthers;
    }

    public void setNumberOfSendToOthers(int numberOfSendToOthers) {
        this.numberOfSendToOthers = numberOfSendToOthers;
    }

    public int getNumberOfSendEndMission() {
        return numberOfSendEndMission;
    }

    public void setNumberOfSendEndMission(int numberOfSendEndMission) {
        this.numberOfSendEndMission = numberOfSendEndMission;
    }

    public int getSerialOrUDP() {
        return serialOrUDP;
    }

    public void setSerialOrUDP(int serialOrUDP) {
        this.serialOrUDP = serialOrUDP;
    }

    public String getCOMport() {
        return COMport;
    }

    public void setCOMport(String COMport) {
        this.COMport = COMport;
    }

    public int getCOMrate() {
        return COMrate;
    }

    public void setCOMrate(int COMrate) {
        this.COMrate = COMrate;
    }

    public int getCOMtimeOut() {
        return COMtimeOut;
    }

    public void setCOMtimeOut(int COMtimeOut) {
        this.COMtimeOut = COMtimeOut;
    }

    public int getNumberOfAircraft() {
        return numberOfAircraft;
    }

    public void setNumberOfAircraft(int numberOfAircraft) {
        this.numberOfAircraft = numberOfAircraft;
    }

    public int getNumberOfTarget() {
        return numberOfTarget;
    }

    public void setNumberOfTarget(int numberOfTarget) {
        this.numberOfTarget = numberOfTarget;
    }

    public long getDtStart() {
        return DtStart;
    }

    public void setDtStart(long DtStart) {
        this.DtStart = DtStart;
    }

    public long getDtSend() {
        return DtSend;
    }

    public void setDtSend(long DtSend) {
        this.DtSend = DtSend;
    }

    public double getCaptureDistance() {
        return captureDistance;
    }

    public void setCaptureDistance(double captureDistance) {
        this.captureDistance = captureDistance;
    }

    public double getAltitudeBand() {
        return altitudeBand;
    }

    public void setAltitudeBand(double altitudeBand) {
        this.altitudeBand = altitudeBand;
    }

    public long getTargetFlyOverTime() {
        return targetFlyOverTime;
    }

    public void setTargetFlyOverTime(long targetFlyOverTime) {
        this.targetFlyOverTime = targetFlyOverTime;
    }

    public double getHorSpeed() {
        return horSpeed;
    }

    public void setHorSpeed(double horSpeed) {
        this.horSpeed = horSpeed;
    }

    public double getMinFlightAltitude() {
        return minFlightAltitude;
    }

    public void setMinFlightAltitude(double minFlightAltitude) {
        this.minFlightAltitude = minFlightAltitude;
    }

    public double getDeltaAltitude() {
        return deltaAltitude;
    }

    public void setDeltaAltitude(double deltaAltitude) {
        this.deltaAltitude = deltaAltitude;
    }

    public int getNumberOfNeg() {
        return numberOfNeg;
    }

    public void setNumberOfNeg(int numberOfNeg) {
        this.numberOfNeg = numberOfNeg;
    }

    public long getDtNeg() {
        return dtNeg;
    }

    public void setDtNeg(long dtNeg) {
        this.dtNeg = dtNeg;
    }

    public long getDtNegCicle() {
        return dtNegCicle;
    }

    public void setDtNegCicle(long dtNegCicle) {
        this.dtNegCicle = dtNegCicle;
    }

    public long getPlanningTime() {
        return planningTime;
    }

    public void setPlanningTime(long planningTime) {
        this.planningTime = planningTime;
    }

    public long getDtAlgorithm() {
        return dtAlgorithm;
    }

    public void setDtAlgorithm(long dtAlgorithm) {
        this.dtAlgorithm = dtAlgorithm;
    }

    public int getAlgMaxLine() {
        return algMaxLine;
    }

    public void setAlgMaxLine(int algMaxLine) {
        this.algMaxLine = algMaxLine;
    }

    public int getAlgMaxCol() {
        return algMaxCol;
    }

    public void setAlgMaxCol(int algMaxCol) {
        this.algMaxCol = algMaxCol;
    }

    public double getEciCost() {
        return eciCost;
    }

    public void setEciCost(double eciCost) {
        this.eciCost = eciCost;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getTakeofflat() {
        return takeofflat;
    }

    public void setTakeofflat(double takeofflat) {
        this.takeofflat = takeofflat;
    }

    public double getTakeofflon() {
        return takeofflon;
    }

    public void setTakeofflon(double takeofflon) {
        this.takeofflon = takeofflon;
    }

    public double getT1latOwnDeg() {
        return T1latOwnDeg;
    }

    public void setT1latOwnDeg(double T1latOwnDeg) {
        this.T1latOwnDeg = T1latOwnDeg;
    }

    public double getT2latOwnDeg() {
        return T2latOwnDeg;
    }

    public void setT2latOwnDeg(double T2latOwnDeg) {
        this.T2latOwnDeg = T2latOwnDeg;
    }

    public double getT3latOwnDeg() {
        return T3latOwnDeg;
    }

    public void setT3latOwnDeg(double T3latOwnDeg) {
        this.T3latOwnDeg = T3latOwnDeg;
    }

    public double getT4latOwnDeg() {
        return T4latOwnDeg;
    }

    public void setT4latOwnDeg(double T4latOwnDeg) {
        this.T4latOwnDeg = T4latOwnDeg;
    }

    public double getT5latOwnDeg() {
        return T5latOwnDeg;
    }

    public void setT5latOwnDeg(double T5latOwnDeg) {
        this.T5latOwnDeg = T5latOwnDeg;
    }

    public double getT6latOwnDeg() {
        return T6latOwnDeg;
    }

    public void setT6latOwnDeg(double T6latOwnDeg) {
        this.T6latOwnDeg = T6latOwnDeg;
    }

    public double getT7latOwnDeg() {
        return T7latOwnDeg;
    }

    public void setT7latOwnDeg(double T7latOwnDeg) {
        this.T7latOwnDeg = T7latOwnDeg;
    }

    public double getT8latOwnDeg() {
        return T8latOwnDeg;
    }

    public void setT8latOwnDeg(double T8latOwnDeg) {
        this.T8latOwnDeg = T8latOwnDeg;
    }

    public double getT1lonOwnDeg() {
        return T1lonOwnDeg;
    }

    public void setT1lonOwnDeg(double T1lonOwnDeg) {
        this.T1lonOwnDeg = T1lonOwnDeg;
    }

    public double getT2lonOwnDeg() {
        return T2lonOwnDeg;
    }

    public void setT2lonOwnDeg(double T2lonOwnDeg) {
        this.T2lonOwnDeg = T2lonOwnDeg;
    }

    public double getT3lonOwnDeg() {
        return T3lonOwnDeg;
    }

    public void setT3lonOwnDeg(double T3lonOwnDeg) {
        this.T3lonOwnDeg = T3lonOwnDeg;
    }

    public double getT4lonOwnDeg() {
        return T4lonOwnDeg;
    }

    public void setT4lonOwnDeg(double T4lonOwnDeg) {
        this.T4lonOwnDeg = T4lonOwnDeg;
    }

    public double getT5lonOwnDeg() {
        return T5lonOwnDeg;
    }

    public void setT5lonOwnDeg(double T5lonOwnDeg) {
        this.T5lonOwnDeg = T5lonOwnDeg;
    }

    public double getT6lonOwnDeg() {
        return T6lonOwnDeg;
    }

    public void setT6lonOwnDeg(double T6lonOwnDeg) {
        this.T6lonOwnDeg = T6lonOwnDeg;
    }

    public double getT7lonOwnDeg() {
        return T7lonOwnDeg;
    }

    public void setT7lonOwnDeg(double T7lonOwnDeg) {
        this.T7lonOwnDeg = T7lonOwnDeg;
    }

    public double getT8lonOwnDeg() {
        return T8lonOwnDeg;
    }

    public void setT8lonOwnDeg(double T8lonOwnDeg) {
        this.T8lonOwnDeg = T8lonOwnDeg;
    }

    public ArrayList<Integer> getCommunicationParams() {
        return CommunicationParams;
    }

    public void setCommunicationParams(ArrayList<Integer> CommunicationParams) {
        this.CommunicationParams = CommunicationParams;
    }

    public ArrayList<Double> getScenarioParams() {
        return ScenarioParams;
    }

    public void setScenarioParams(ArrayList<Double> ScenarioParams) {
        this.ScenarioParams = ScenarioParams;
    }

    public ArrayList<Double> getAlgorithmParams() {
        return AlgorithmParams;
    }

    public void setAlgorithmParams(ArrayList<Double> AlgorithmParams) {
        this.AlgorithmParams = AlgorithmParams;
    }

    public ArrayList<String> getTargetParams() {
        return TargetParams;
    }

    public void setTargetParams(ArrayList<String> TargetParams) {
        this.TargetParams = TargetParams;
    }

    @Override
    public String toString() {
        return "DataSource{" + "file=" + file + "\nnumberOfSendToAutopilot=" + numberOfSendToAutopilot + "\nnumberOfSendToOthers=" + numberOfSendToOthers + "\nnumberOfSendEndMission=" + numberOfSendEndMission + "\nserialOrUDP=" + serialOrUDP + "\nCOMport=" + COMport + "\nCOMrate=" + COMrate + "\nCOMtimeOut=" + COMtimeOut + "\nCommunicationParams=" + CommunicationParams + "\nnumberOfAircraft=" + numberOfAircraft + "\nnumberOfTarget=" + numberOfTarget + "\nDtStart=" + DtStart + "\nDtSend=" + DtSend + "\ncaptureDistance=" + captureDistance + "\naltitudeBand=" + altitudeBand + "\ntargetFlyOverTime=" + targetFlyOverTime + "\nhorSpeed=" + horSpeed + "\nminFlightAltitude=" + minFlightAltitude + "\ndeltaAltitude=" + deltaAltitude + "\nScenarioParams=" + ScenarioParams + "\nnumberOfNeg=" + numberOfNeg + "\ndtNeg=" + dtNeg + "\ndtNegCicle=" + dtNegCicle + "\nplanningTime=" + planningTime + "\ndtAlgorithm=" + dtAlgorithm + "\nalgMaxLine=" + algMaxLine + "\nalgMaxCol=" + algMaxCol + "\neciCost=" + eciCost + "\nbeta=" + beta + "\nAlgorithmParams=" + AlgorithmParams + "\ntakeofflat=" + takeofflat + "\ntakeofflon=" + takeofflon + "\nT1latOwnDeg=" + T1latOwnDeg + "\nT2latOwnDeg=" + T2latOwnDeg + "\nT3latOwnDeg=" + T3latOwnDeg + "\nT4latOwnDeg=" + T4latOwnDeg + "\nT5latOwnDeg=" + T5latOwnDeg + "\nT6latOwnDeg=" + T6latOwnDeg + "\nT7latOwnDeg=" + T7latOwnDeg + "\nT8latOwnDeg=" + T8latOwnDeg + "\nT1lonOwnDeg=" + T1lonOwnDeg + "\nT2lonOwnDeg=" + T2lonOwnDeg + "\nT3lonOwnDeg=" + T3lonOwnDeg + "\nT4lonOwnDeg=" + T4lonOwnDeg + "\nT5lonOwnDeg=" + T5lonOwnDeg + "\nT6lonOwnDeg=" + T6lonOwnDeg + "\nT7lonOwnDeg=" + T7lonOwnDeg + "\nT8lonOwnDeg=" + T8lonOwnDeg + "\nTargetParams=" + TargetParams + '}';
    }
    
    public DataSource() {
        loadDataSource("Mission.xls");
    }
    
    public DataSource(String file) {
        this.file = file;
        loadDataSource(file);
    }
    
    private void loadDataSource(String file) {
        
        AlgorithmParams = new ArrayList<Double>();
        ScenarioParams = new ArrayList<Double>();               
        CommunicationParams = new ArrayList<Integer>();
        TargetParams = new ArrayList<String>();
        drones = new ArrayList<Integer>();
        ReadXls xls = new ReadXls(file);
        try{
            
            String[][] data = xls.start();
            for (int j = 0; j < data.length; j++) {
                for (int i = 0; i < data[j].length; i++) {
                    if (!data[j][i].isEmpty()) {
                        if (data[j][i].equals("numberOfSendToAutopilot")){                            
                            numberOfSendToAutopilot = Integer.parseInt(data[j+1][i]);
                            CommunicationParams.add(numberOfSendToAutopilot);
                        }
                        if (data[j][i].equals("numberOfSendToOthers")){
                           numberOfSendToOthers = Integer.parseInt(data[j+1][i]);    // [] Numero di volte che si invia lo stesso pacchetto agli altri velivoli                            
                           CommunicationParams.add(numberOfSendToOthers);
                        }
                        if (data[j][i].equals("numberOfSendEndMission")){
                            numberOfSendEndMission = Integer.parseInt(data[j+1][i]);  // [] Numero di volte che si invia in segnale di fine missione                           
                            CommunicationParams.add(numberOfSendEndMission);
                        }
                        if (data[j][i].equals("serialOrUDP")){
                            serialOrUDP = Integer.parseInt(data[j+1][i]);  // [] 0 = Serial port communication, 1 = UDP communication                          
                            CommunicationParams.add(serialOrUDP);
                        }
                        if (data[j][i].equals("COMport")){
                            COMport = data[j+1][i];                        // [] Porta con cui comunicare con l'autopilota                           
                            int COMportI = Integer.parseInt(COMport.replaceFirst("COM", ""));  // Storing Only value
                            CommunicationParams.add(COMportI);
                        }
                        if (data[j][i].equals("COMrate")){
                            COMrate = Integer.parseInt(data[j+1][i]);      // [Hz] Rate di comunicazione con l'autopilot                            
                            CommunicationParams.add(COMrate);
                        }
                        if (data[j][i].equals("COMtimeOut")){
                            COMtimeOut = Integer.parseInt(data[j+1][i]);   // [ms] timeout per la disconnessione in caso di mancato collegamento                            
                            CommunicationParams.add(COMtimeOut);
                        }
                        // Scenario parameters
                        if (data[j][i].equals("numberOfAircraft")){                           
                            numberOfAircraft = Integer.parseInt(data[j+1][i]);                      // [] Numero di velivoli della missione                            
                            ScenarioParams.add(numberOfAircraft + 0.0);
                        }
                        if (data[j][i].equals("numberOfTarget")){
                            numberOfTarget = Integer.parseInt(data[j+1][i]);                        // [] Numero di target della missione                            
                            ScenarioParams.add(numberOfTarget + 0.0);
                        }
                        if (data[j][i].equals("DtStart")){
                            DtStart = Long.parseLong(data[j+1][i]);                                 // [ms] Delta tempo di partenza della missione rispetto al tempo di inizio simulazione                             
                            ScenarioParams.add(DtStart + 0.0);
                        }
                        if (data[j][i].equals("DtSend")){
                            DtSend = Long.parseLong(data[j+1][i]);                                  // [ms] Delta tempo di fine di inviare la missione rispetto al tempo di inizio simulazione                             
                            ScenarioParams.add(DtSend + 0.0);
                        }
                        if (data[j][i].equals("captureDistance")) {                            
                            captureDistance = Double.parseDouble(data[j + 1][i].replace(',', '.')); // [m] Distanza orizzontale dal target al di sotto della quale il target risulta catturato      
                            ScenarioParams.add(captureDistance + 0.0);
                        }
                        if (data[j][i].equals("altitudeBand")){                           
                            altitudeBand = Double.parseDouble(data[j + 1][i].replace(',', '.'));    // [m] Distanza verticale dal target al di sotto della quale il target risulta catturato                             
                            ScenarioParams.add(altitudeBand + 0.0);
                        }
                        if (data[j][i].equals("targetFlyOverTime")){
                            targetFlyOverTime = Long.parseLong(data[j+1][i]);                       // [ms] Tempo di permanenza sul target una volta raggiunto    
                            ScenarioParams.add(targetFlyOverTime + 0.0);
                        }
                        if (data[j][i].equals("horSpeed")) {
                            horSpeed = Float.parseFloat(data[j + 1][i].replace(',', '.'));          // [m/s] velocità orizzontale di percorrensa tra i target     
                            ScenarioParams.add(horSpeed + 0.0);
                        }
                        if (data[j][i].equals("minFlightAltitude")) {
                            minFlightAltitude = Float.parseFloat(data[j + 1][i].replace(',', '.')); // [m] Quota di crociera del target più basso   
                            ScenarioParams.add(minFlightAltitude + 0.0);
                        }
                        if (data[j][i].equals("deltaAltitude")) {
                            deltaAltitude = Float.parseFloat(data[j + 1][i].replace(',', '.'));     // [m] Distanza minima tra due target in crociera 
                            ScenarioParams.add(deltaAltitude + 0.0);
                        }
                        //Algorithm parameters
                        if (data[j][i].equals("numberOfNeg")){
                            numberOfNeg = Integer.parseInt(data[j+1][i]);                           // [] Numero di negoziazione che costituiscono un ciclo di negoziazione                            
                            AlgorithmParams.add(numberOfNeg + 0.0);
                        }
                        if (data[j][i].equals("dtNeg")) {
                            dtNeg = Long.parseLong(data[j + 1][i]);                                 // [ms] Tempo che intercorre tra due negoziazioni dello stesso ciclo   
                            AlgorithmParams.add(dtNeg + 0.0);
                        }
                        if (data[j][i].equals("dtNegCicle")) {
                            dtNegCicle = Long.parseLong(data[j + 1][i]);                            // [ms] Tempo che intercorre tra l'inizio di due cicli di negozizione    
                            AlgorithmParams.add(dtNeg + 0.0);
                        }
                        if (data[j][i].equals("planningTime")) {
                            planningTime = Long.parseLong(data[j + 1][i]);                          // [ms] Tempo considerato dall'algoritmo per pianificare il piano di volo    
                            AlgorithmParams.add(planningTime + 0.0);
                        }
                        if (data[j][i].equals("dtAlgorithm")) {
                            dtAlgorithm = Long.parseLong(data[j + 1][i]);                           // [ms] Intervallo di tempo dedicato all'elaborazione dell'algoritmo    
                            AlgorithmParams.add(dtAlgorithm + 0.0);
                        }
                        if (data[j][i].equals("algMaxLine")) {
                            algMaxLine = Integer.parseInt(data[j + 1][i]);                          // [] Massimo numero di piani possibili da valutare                         
                            AlgorithmParams.add(algMaxLine + 0.0);
                        }
                        if (data[j][i].equals("algMaxCol")) {
                            algMaxCol = Integer.parseInt(data[j + 1][i]);                           // [] Massimo numero di target per piano di volo                          
                            AlgorithmParams.add(algMaxCol + 0.0);
                        }
                        if (data[j][i].equals("eciCost")){                           
                            eciCost = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [] Parametro "p" dell'algoritmo di sorveglianza persistente   
                            AlgorithmParams.add(eciCost + 0.0);
                        }
                        if (data[j][i].equals("beta")){                           
                            beta = Double.parseDouble(data[j + 1][i].replace(',', '.'));            // [] Parametro "beta" dell'algoritmo di sorveglianza persistente                            
                            AlgorithmParams.add(beta + 0.0);
                        }
                        //TakeOff parameters
                        if (data[j][i].equals("TakeOff")) {
                            takeofflat = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            takeofflon = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo
                            TargetParams.add(new String(takeofflat + ", " + takeofflon));
                        }
                        if (data[j][i].equals("T1")) {
                            T1latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T1lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T1latOwnDeg + ", " + T1lonOwnDeg));
                        }
                        if (data[j][i].equals("T2")) {
                            T2latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T2lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T2latOwnDeg + ", " + T2lonOwnDeg));
                        }
                        if (data[j][i].equals("T3")) {
                            T3latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T3lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T3latOwnDeg + ", " + T3lonOwnDeg));
                        }
                        if (data[j][i].equals("T4")) {
                            T4latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T4lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T4latOwnDeg + ", " + T4lonOwnDeg));
                        }
                        if (data[j][i].equals("T5")) {
                            T5latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T5lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T5latOwnDeg + ", " + T5lonOwnDeg));
                        }
                        if (data[j][i].equals("T6")) {
                            T6latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T6lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T6latOwnDeg + ", " + T6lonOwnDeg));
                        }
                        if (data[j][i].equals("T7")) {
                            T7latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T7lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T7latOwnDeg + ", " + T7lonOwnDeg));
                        }
                        if (data[j][i].equals("T8")) {
                            T8latOwnDeg = Double.parseDouble(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                           
                            T8lonOwnDeg = Double.parseDouble(data[j + 2][i].replace(',', '.'));         // [def] Longitudine del punto di decollo                           
                            TargetParams.add(new String(T8latOwnDeg + ", " + T8lonOwnDeg));
                        }
                        if (data[j][i].equals("A1")) {
                            Integer latOwnDeg = Integer.parseInt(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                                                     
                            drones.add(latOwnDeg);
                        }
                        if (data[j][i].equals("A2")) {
                        	Integer latOwnDeg = Integer.parseInt(data[j + 1][i].replace(',', '.'));         // [deg] Latitudine del punto di decollo                                                     
                            drones.add(latOwnDeg);
                        }
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}

