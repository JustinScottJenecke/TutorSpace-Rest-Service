package za.ac.cput.factory.operations.tutor;


import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;

/**
 * Factory class for creating Qualifications
 * Author: Justin Scott Jenecke
 */

public class QualificationFactory {

    public static Qualification createQualification(int qualNo,
                                                    int nqfLevel,
                                                    String institution,
                                                    String major,
                                                    Tutor tutor){

        Qualification qualification = new Qualification.Builder()
                .setQualNo(qualNo)
                .setNqfLevel(nqfLevel)
                .setInstitution(institution)
                .setMajor(major)
                .setTutor(tutor)
                .build();

        return qualification;

    }
}
