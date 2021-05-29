package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;

public class Grupa {
	private List<IStudent> studenti;
    private int nrGrupa;

    public Grupa(int nrGrupa){
    	if(nrGrupa>=1000 && nrGrupa<=1100) {
    		 this.nrGrupa=nrGrupa;
    	}else {
    		throw new IllegalArgumentException();
    	}
        studenti=new ArrayList<>();
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        if(studenti.size() ==0) {
        	return 0;
        }
        int nrRestantieri=0;
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return (studenti.size() -nrRestantieri)/(float)studenti.size();
    }

	public List<IStudent> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<IStudent> studenti) {
		this.studenti = studenti;
	}

	public int getNrGrupa() {
		return nrGrupa;
	}

	public void setNrGrupa(int nrGrupa) {
		this.nrGrupa = nrGrupa;
	}
    
    
}
