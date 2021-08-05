package za.ac.cput.factory.operations.tutor;

import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.QualificationList;

import java.util.Set;

/**
 * Factory class for creating QualificationLists
 * Author: Justin Scott Jenecke
 */

public class QualificationListFactory {

    public static QualificationList createQualificationList(int qListNo,
                                                            Set<Qualification> qualifications) {

        QualificationList qualificationList = new QualificationList.Builder()
                .setqListNo(qListNo)
                .setQualifications(qualifications)
                .build();

        return qualificationList;
    }

}
