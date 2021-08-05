package za.ac.cput.factoryTest.operations.tutor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.QualificationList;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Factory test class for testing creation of QualificationLists
 * Author: Justin Scott Jenecke
 */

class QualificationListFactoryTest {

    Set<Qualification> list = new HashSet<Qualification>();

    Set<String> stringList = new HashSet<String>();

    @BeforeEach
    void setUp() {

        Qualification q1 = new Qualification.Builder()
                .setQualNo(1)
                .setMajor("CS")
                .setInstitution("UWC")
                .build();

        list.add(q1);
    }

    @Test
    void createQualificationList() {

        QualificationList qualificationList = new QualificationList.Builder()
                .setqListNo(101)
                .setQualifications(list)
                .build();

        //System.out.println(qualificationList.getQualifications());
        assertEquals(101, qualificationList.getqListNo());
        assertNotSame(stringList, qualificationList.getQualifications());
        assertEquals("[Qualification{qualNo=1, nqfLevel=0, institution='UWC', major='CS'}]", qualificationList.getQualifications().toString());

    }
}