package com.cornelius.angularinventory.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cornelius.angularinventory.entities.Activitylog;
import com.cornelius.angularinventory.entities.Brand;
import com.cornelius.angularinventory.entities.Category;
import com.cornelius.angularinventory.entities.Status;
import com.cornelius.angularinventory.entities.Usertype;
import com.cornelius.angularinventory.service.ApplicationService;


@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	ApplicationService applicationService;

	/*---Get all Brands---*/
	@GetMapping("/brands")
	public ResponseEntity<List<Brand>> list() {
		List<Brand> brandss = applicationService.getBrandRepository().findAll();
		return ResponseEntity.ok().body(brandss);
	}

	/*---Get a Brand by id---*/
	@GetMapping("/brand/{id}")
	public ResponseEntity<?> getBrandById(@PathVariable("id") Integer id) {
		Brand bran = applicationService.getBrandRepository().findBrandById(id);
		return ResponseEntity.ok().body(bran);
	}

	/*---Delete a Brand by id---*/
	@DeleteMapping("/brand/{id}")
	public ResponseEntity<?> deleteBrandById(@PathVariable("id") Integer id) {
		Brand brandId = applicationService.getBrandRepository().findBrandById(id);
		applicationService.getBrandRepository().delete(brandId);
		return ResponseEntity.ok().body("Brand has been deleted successfully.");
	}

	/*---Add new Brand---*/
	@PostMapping("/brand")
	public ResponseEntity<?> saveBrand(@RequestBody Brand brand) {
		Brand brandd = applicationService.getBrandRepository().save(brand);
		return ResponseEntity.ok().body(Collections.singletonMap("id", brandd.getBrandid()));
	}

	/*---Update a User by id---*/
	@PutMapping("/brand/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Brand brand) {
		Brand brandd = applicationService.getBrandRepository().save(brand);
		return ResponseEntity.ok().body(Collections.singletonMap("id", brandd.getBrandid()));
	}

	////////////// Category///////////////////

	@GetMapping("/category")
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> cate = applicationService.getCategoryRepository().findAll();
		return ResponseEntity.ok().body(cate);
	}

	/*---Get a Category by id---*/
	@GetMapping("/category/{id}")
	public ResponseEntity<?> getCategoryById(@PathVariable("id") Integer id) {
		Category cat = applicationService.getCategoryRepository().findByCategoryid(id);
		return ResponseEntity.ok().body(cat);
	}

	/*---Delete a Category by id---*/
	@DeleteMapping("/category/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		Category catId = applicationService.getCategoryRepository().findByCategoryid(id);
		applicationService.getCategoryRepository().delete(catId);
		return ResponseEntity.ok().body("Category has been deleted successfully.");
	}

	/*---Add new Category ---*/
	@PostMapping("/category")
	public ResponseEntity<?> saveCategory(@RequestBody Category category) {
		Category cat = applicationService.getCategoryRepository().save(category);
		return ResponseEntity.ok().body(Collections.singletonMap("id", cat.getCategoryid()));
	}

	/*---Update a User by id---*/
	@PutMapping("/category/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Category category) {
		Category cat = applicationService.getCategoryRepository().save(category);
		return ResponseEntity.ok().body(Collections.singletonMap("id", cat.getCategoryid()));
	}

	///////////// STATUS AND LOG ACTIVITY///////////////////

	@GetMapping("/status")
	public ResponseEntity<List<Status>> statusList() {
		List<Status> stat = applicationService.getStatusRepository().findAll();
		return ResponseEntity.ok().body(stat);
	}

	/*---Get Status by id---*/
	@GetMapping("/status/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Integer id) {
		Status stat = applicationService.getStatusRepository().findStatusById(id);
		return ResponseEntity.ok().body(stat);
	}

	/*---Add new Status---*/
	@PostMapping("/statuss")
	public ResponseEntity<?> saveStatus(@RequestBody Status status) {
		Status stat = applicationService.getStatusRepository().save(status);
		return ResponseEntity.ok().body(Collections.singletonMap("id", stat.getStatusid()));
	}

	/*---Update a Status by id---*/
	@PutMapping("/status/{id}")
	public ResponseEntity<?> updateStatus(@RequestBody Status status) {
		Status stat = applicationService.getStatusRepository().save(status);
		return ResponseEntity.ok().body(Collections.singletonMap("id", stat.getStatusid()));
	}

	/*---Delete Status by id---*/
	@DeleteMapping("/status/{id}")
	public ResponseEntity<?> deleteStatus(@PathVariable("id") Integer id) {
		Status stat = applicationService.getStatusRepository().findStatusById(id);
		applicationService.getStatusRepository().delete(stat);
		return ResponseEntity.ok().body("Status has been deleted successfully.");
	}

	// Usertype Controller CRUD Methods
	/*---Get all Usertypes ---*/
	@GetMapping("/usertypes")
	public ResponseEntity<List<Usertype>> getUsertypes() {
		List<Usertype> utype = applicationService.getUsertypeRepository().findAll();
		return ResponseEntity.ok().body(utype);
	}

	/*---Get Status by id---*/
	@GetMapping("/usertype/{id}")
	public ResponseEntity<?> getUsertypeid(@PathVariable("id") Integer id) {
		Usertype stat = applicationService.getUsertypeRepository().findUserTypeById(id);
		return ResponseEntity.ok().body(stat);
	}

	/*---Add new Usertype---*/
	@PostMapping("/usertype")
	public ResponseEntity<?> saveUsertype(@RequestBody Usertype usertype) {
		Usertype utype = applicationService.getUsertypeRepository().save(usertype);
		return ResponseEntity.ok().body(Collections.singletonMap("id", utype.getTypeid()));
	}

	/*---Update a Usertype by id---*/
	@PutMapping("/usertype/{id}")
	public ResponseEntity<?> updateUser(@RequestBody Usertype usertype) {
		Usertype utype = applicationService.getUsertypeRepository().save(usertype);
		return ResponseEntity.ok().body(Collections.singletonMap("id", utype.getTypeid()));
	}

	/*---Delete Usertype by id---*/
	@DeleteMapping("/usertype/{id}")
	public ResponseEntity<?> deleteUsertype(@PathVariable("id") Integer id) {
		Usertype utype = applicationService.getUsertypeRepository().findUserTypeById(id);
		applicationService.getUsertypeRepository().delete(utype);
		return ResponseEntity.ok().body("usertype has been deleted successfully.");
	}

	// Activitylog Controller CRUD Methods
	/*---Get all Activities ---*/
	@GetMapping("/activitieslogs")
	public ResponseEntity<List<Activitylog>> getActivitieslog() {
		List<Activitylog> activity = applicationService.getActivitylogRepository().findAll();
		return ResponseEntity.ok().body(activity);
	}

	/*---Get Activitylog by id---*/
	@GetMapping("/activitylog/{id}")
	public ResponseEntity<?> getactivitieslogid(@PathVariable("id") Integer id) {
		Activitylog activity = applicationService.getActivitylogRepository().findByActivitlogId(id);
		return ResponseEntity.ok().body(activity);
	}

	/*---Add new Activitylog---*/
	@PostMapping("/activitylog")
	public ResponseEntity<?> saveActivitylog(@RequestBody Activitylog activitylog) {
		Activitylog activity = applicationService.getActivitylogRepository().save(activitylog);
		return ResponseEntity.ok().body(Collections.singletonMap("id", activity.getLogid()));
	}

	/*---Update an Activitylog by id---*/
	@PutMapping("/activitylog/{id}")
	public ResponseEntity<?> updateActivitylog(@RequestBody Activitylog activity) {
		Activitylog activityu = applicationService.getActivitylogRepository().save(activity);
		return ResponseEntity.ok().body(Collections.singletonMap("id", activityu.getLogid()));
	}

	/*---Delete Activitylog by id---*/
	@DeleteMapping("/activitylog/{id}")
	public ResponseEntity<?> deleteActivitylog(@PathVariable("id") Integer id) {
		Activitylog activityd = applicationService.getActivitylogRepository().findByActivitlogId(id);
		applicationService.getActivitylogRepository().delete(activityd);
		return ResponseEntity.ok().body("activitylog has been deleted successfully.");
	}

}
