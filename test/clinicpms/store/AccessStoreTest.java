/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicpms.store;

import clinicpms.model.Appointment;
import clinicpms.model.Entity;
import clinicpms.model.IStoreClient;
import clinicpms.model.Patient;
import clinicpms.model.PatientNotification;
import clinicpms.model.StoreManager;
import clinicpms.model.SurgeryDaysAssignment;
import java.io.File;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author colin
 */
public class AccessStoreTest {
    
    public AccessStoreTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class AccessStore.
     */
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
        AccessStore expResult = null;
        AccessStore result = AccessStore.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AccessStore.
     */
    @Test
    public void testInsert_SurgeryDaysAssignment() throws Exception {
        System.out.println("insert");
        SurgeryDaysAssignment surgeryDaysAssignment = null;
        AccessStore instance = new AccessStore();
        instance.insert(surgeryDaysAssignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AccessStore.
     */
    @Test
    public void testInsert_Appointment_Integer() throws Exception {
        System.out.println("insert");
        Appointment appointment = null;
        Integer appointeeKey = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.insert(appointment, appointeeKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AccessStore.
     */
    @Test
    public void testInsert_PatientNotification() throws Exception {
        System.out.println("insert");
        PatientNotification pn = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.insert(pn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AccessStore.
     */
    @Test
    public void testInsert_Patient_Integer() throws Exception {
        System.out.println("insert");
        Patient patient = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.insert(patient, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccessStore.
     */
    @Test
    public void testDelete_Patient() {
        System.out.println("delete");
        Patient patient = null;
        AccessStore instance = new AccessStore();
        instance.delete(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccessStore.
     */
    @Test
    public void testDelete_PatientNotification_Integer() throws Exception {
        System.out.println("delete");
        PatientNotification patientNotification = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        instance.delete(patientNotification, key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccessStore.
     */
    @Test
    public void testDelete_Appointment_Integer() throws Exception {
        System.out.println("delete");
        Appointment appointment = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        instance.delete(appointment, key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccessStore.
     */
    @Test
    public void testRead_PatientNotification_Integer() throws Exception {
        System.out.println("read");
        PatientNotification patientNotification = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        PatientNotification expResult = null;
        PatientNotification result = instance.read(patientNotification, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccessStore.
     */
    @Test
    public void testRead_SurgeryDaysAssignment() throws Exception {
        System.out.println("read");
        SurgeryDaysAssignment s = null;
        AccessStore instance = new AccessStore();
        SurgeryDaysAssignment expResult = null;
        SurgeryDaysAssignment result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AccessStore.
     */
    @Test
    public void testCount_PatientNotification() throws Exception {
        System.out.println("count");
        PatientNotification patientNotification = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.count(patientNotification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AccessStore.
     */
    @Test
    public void testCount_Appointment_Integer() throws Exception {
        System.out.println("count");
        Appointment appointment = null;
        Integer appointeeKey = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.count(appointment, appointeeKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AccessStore.
     */
    @Test
    public void testCount_Patient() throws Exception {
        System.out.println("count");
        Patient patient = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.count(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AccessStore.
     */
    @Test
    public void testCount_SurgeryDaysAssignment() throws Exception {
        System.out.println("count");
        SurgeryDaysAssignment surgeryDaysAssignment = null;
        AccessStore instance = new AccessStore();
        Integer expResult = null;
        Integer result = instance.count(surgeryDaysAssignment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccessStore.
     */
    @Test
    public void testRead_Appointment_Integer() throws Exception {
        System.out.println("read");
        Appointment appointment = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        Appointment expResult = null;
        Appointment result = instance.read(appointment, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccessStore.
     */
    @Test
    public void testRead_Patient_Integer() throws Exception {
        System.out.println("read");
        Patient patient = null;
        Integer key = null;
        AccessStore instance = new AccessStore();
        Patient expResult = null;
        Patient result = instance.read(patient, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessStore.
     */
    @Test
    public void testUpdate_3args_1() throws Exception {
        System.out.println("update");
        Appointment appointment = null;
        Integer key = null;
        Integer appointeeKey = null;
        AccessStore instance = new AccessStore();
        instance.update(appointment, key, appointeeKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessStore.
     */
    @Test
    public void testUpdate_3args_2() throws Exception {
        System.out.println("update");
        Patient patient = null;
        Integer key = null;
        Integer guardianKey = null;
        AccessStore instance = new AccessStore();
        instance.update(patient, key, guardianKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessStore.
     */
    @Test
    public void testUpdate_3args_3() throws Exception {
        System.out.println("update");
        PatientNotification pn = null;
        Integer key = null;
        Integer patientKey = null;
        AccessStore instance = new AccessStore();
        instance.update(pn, key, patientKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessStore.
     */
    @Test
    public void testUpdate_SurgeryDaysAssignment() throws Exception {
        System.out.println("update");
        SurgeryDaysAssignment surgeryDaysAssignment = null;
        AccessStore instance = new AccessStore();
        instance.update(surgeryDaysAssignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessStore.
     */
    @Test
    public void testCreate_Appointment() throws Exception {
        System.out.println("create");
        Appointment table = null;
        AccessStore instance = new AccessStore();
        instance.create(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessStore.
     */
    @Test
    public void testCreate_PatientNotification() throws Exception {
        System.out.println("create");
        PatientNotification pn = null;
        AccessStore instance = new AccessStore();
        instance.create(pn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessStore.
     */
    @Test
    public void testCreate_Patient() throws Exception {
        System.out.println("create");
        Patient table = null;
        AccessStore instance = new AccessStore();
        instance.create(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccessStore.
     */
    @Test
    public void testCreate_SurgeryDaysAssignment() throws Exception {
        System.out.println("create");
        SurgeryDaysAssignment surgeryDaysAssignment = null;
        AccessStore instance = new AccessStore();
        instance.create(surgeryDaysAssignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drop method, of class AccessStore.
     */
    @Test
    public void testDrop_Appointment() throws Exception {
        System.out.println("drop");
        Appointment table = null;
        AccessStore instance = new AccessStore();
        instance.drop(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drop method, of class AccessStore.
     */
    @Test
    public void testDrop_Patient() throws Exception {
        System.out.println("drop");
        Patient table = null;
        AccessStore instance = new AccessStore();
        instance.drop(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drop method, of class AccessStore.
     */
    @Test
    public void testDrop_SurgeryDaysAssignment() throws Exception {
        System.out.println("drop");
        SurgeryDaysAssignment table = null;
        AccessStore instance = new AccessStore();
        instance.drop(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importEntityFromCSV method, of class AccessStore.
     */
    @Test
    public void testImportEntityFromCSV() throws Exception {
        System.out.println("importEntityFromCSV");
        Entity entity = null;
        AccessStore instance = new AccessStore();
        List expResult = null;
        List result = instance.importEntityFromCSV(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populate method, of class AccessStore.
     */
    @Test
    public void testPopulate() throws Exception {
        System.out.println("populate");
        SurgeryDaysAssignment surgeryDaysAssignment = null;
        AccessStore instance = new AccessStore();
        instance.populate(surgeryDaysAssignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientCount method, of class AccessStore.
     */
    @Test
    public void testSetPatientCount() {
        System.out.println("setPatientCount");
        int value = 0;
        AccessStore instance = new AccessStore();
        instance.setPatientCount(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNonExistingPatientsReferencedByAppointmentsCount method, of class AccessStore.
     */
    @Test
    public void testGetNonExistingPatientsReferencedByAppointmentsCount() {
        System.out.println("getNonExistingPatientsReferencedByAppointmentsCount");
        AccessStore instance = new AccessStore();
        int expResult = 0;
        int result = instance.getNonExistingPatientsReferencedByAppointmentsCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNonExistingPatientsReferencedByAppointmentsCount method, of class AccessStore.
     */
    @Test
    public void testSetNonExistingPatientsReferencedByAppointmentsCount() {
        System.out.println("setNonExistingPatientsReferencedByAppointmentsCount");
        int value = 0;
        AccessStore instance = new AccessStore();
        instance.setNonExistingPatientsReferencedByAppointmentsCount(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialiseTargetStore method, of class AccessStore.
     */
    @Test
    public void testInitialiseTargetStore() throws Exception {
        System.out.println("initialiseTargetStore");
        File file = null;
        AccessStore instance = new AccessStore();
        File expResult = null;
        File result = instance.initialiseTargetStore(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccessStore.
     */
    @Test
    public void testRead_StoreManager() throws Exception {
        System.out.println("read");
        StoreManager pmsStore = null;
        AccessStore instance = new AccessStore();
        IStoreClient expResult = null;
        IStoreClient result = instance.read(pmsStore);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccessStore.
     */
    @Test
    public void testUpdate_StoreManager() throws Exception {
        System.out.println("update");
        StoreManager pmsStore = null;
        AccessStore instance = new AccessStore();
        instance.update(pmsStore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
