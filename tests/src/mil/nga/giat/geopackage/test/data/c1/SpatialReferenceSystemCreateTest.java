package mil.nga.giat.geopackage.test.data.c1;

import java.sql.SQLException;

import mil.nga.giat.geopackage.GeoPackage;
import mil.nga.giat.geopackage.GeoPackageActivity;
import mil.nga.giat.geopackage.test.TestUtils;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Test Spatial Reference System from a created database (C.1.
 * gpkg_spatial_ref_sys)
 * 
 * @author osbornb
 */
public class SpatialReferenceSystemCreateTest extends
		ActivityInstrumentationTestCase2<GeoPackageActivity> {

	/**
	 * GeoPackage activity
	 */
	private Activity activity = null;

	/**
	 * GeoPackage
	 */
	private GeoPackage geoPackage = null;

	/**
	 * Constructor
	 */
	public SpatialReferenceSystemCreateTest() {
		super(GeoPackageActivity.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		// Set the activity
		activity = getActivity();

		// Create the database
		geoPackage = TestUtils.setUpCreate(activity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void tearDown() throws Exception {

		// Tear down the create database
		TestUtils.tearDownCreate(activity, geoPackage);

		super.tearDown();
	}

	/**
	 * Test reading
	 * 
	 * @throws SQLException
	 */
	public void testRead() throws SQLException {

		SpatialReferenceSystemUtils.testRead(geoPackage, 3);

	}

	/**
	 * Test reading using the SQL/MM view
	 * 
	 * @throws SQLException
	 */
	public void testSqlMmRead() throws SQLException {

		SpatialReferenceSystemUtils.testSqlMmRead(geoPackage, 3);

	}

	/**
	 * Test reading using the SF/SQL view
	 * 
	 * @throws SQLException
	 */
	public void testSfSqlRead() throws SQLException {

		SpatialReferenceSystemUtils.testSfSqlRead(geoPackage, 3);

	}

	/**
	 * Test updating
	 * 
	 * @throws SQLException
	 */
	public void testUpdate() throws SQLException {

		SpatialReferenceSystemUtils.testUpdate(geoPackage);

	}

	/**
	 * Test creating
	 * 
	 * @throws SQLException
	 */
	public void testCreate() throws SQLException {

		SpatialReferenceSystemUtils.testCreate(geoPackage);

	}

	/**
	 * Test deleting
	 * 
	 * @throws SQLException
	 */
	public void testDelete() throws SQLException {

		SpatialReferenceSystemUtils.testDelete(geoPackage);

	}

	/**
	 * Test cascade deleting
	 * 
	 * @throws SQLException
	 */
	public void testDeleteCascade() throws SQLException {

		SpatialReferenceSystemUtils.testDeleteCascade(geoPackage);

	}

}