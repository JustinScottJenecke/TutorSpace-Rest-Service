package za.ac.cput.factory.operations.tutor;


import za.ac.cput.entity.operations.tutor.Qualification;

/**
 * Factory class for creating Qualifications
 * Author: Justin Scott Jenecke
 */

public class QualificationFactory {

    public static Qualification createQualification(int qualNo,
                                                    int nqfLevel,
                                                    String institution,
                                                    String major){

        Qualification qualification = new Qualification.Builder()
                .setQualNo(qualNo)
                .setNqfLevel(nqfLevel)
                .setInstitution(institution)
                .setMajor(major)
                .build();

        return qualification;

    }
}
