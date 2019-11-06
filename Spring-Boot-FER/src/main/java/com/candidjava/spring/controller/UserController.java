/*
 * package com.candidjava.spring.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.MediaType; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PatchMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.util.UriComponentsBuilder;
 * 
 * import com.rs.fer.boot.bean.User1; import
 * com.rs.fer.boot.service.UserService;
 * 
 * @RestController
 * 
 * @RequestMapping(value = { "/user" }) public class UserController {
 * 
 * @Autowired UserService userService;
 * 
 * @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
 * public ResponseEntity<User1> getUserById(@PathVariable("id") long id) {
 * System.out.println("Fetching User with id " + id); User1 user =
 * userService.findById(id); if (user == null) { return new
 * ResponseEntity<User1>(HttpStatus.NOT_FOUND); } return new
 * ResponseEntity<User1>(user, HttpStatus.OK); }
 * 
 * @PostMapping(value = "/create", headers = "Accept=application/json") public
 * ResponseEntity<Void> createUser(@RequestBody User1 user, UriComponentsBuilder
 * ucBuilder) { System.out.println("Creating User " + user.getName());
 * userService.createUser(user); HttpHeaders headers = new HttpHeaders();
 * headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId())
 * .toUri()); return new ResponseEntity<Void>(headers, HttpStatus.CREATED); }
 * 
 * @PostMapping(value = "/createMA", headers = "Accept=application/json") public
 * ResponseEntity<Void> createUserMA(@ModelAttribute User1 user,
 * UriComponentsBuilder ucBuilder) { System.out.println("Creating User " +
 * user.getName()); userService.createUser(user); HttpHeaders headers = new
 * HttpHeaders();
 * headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId())
 * .toUri()); return new ResponseEntity<Void>(headers, HttpStatus.CREATED); }
 * 
 * @GetMapping(value = "/get", headers = "Accept=application/json") public
 * List<User1> getAllUser() { List<User1> tasks = userService.getUser(); return
 * tasks;
 * 
 * }
 * 
 * @PutMapping(value = "/update", headers = "Accept=application/json") public
 * ResponseEntity<String> updateUser(@RequestBody User1 currentUser) {
 * System.out.println("sd"); User1 user =
 * userService.findById(currentUser.getId()); if (user == null) { return new
 * ResponseEntity<String>(HttpStatus.NOT_FOUND); }
 * userService.update(currentUser, currentUser.getId()); return new
 * ResponseEntity<String>(HttpStatus.OK); }
 * 
 * @DeleteMapping(value = "/{id}", headers = "Accept=application/json") public
 * ResponseEntity<User1> deleteUser(@PathVariable("id") long id) { User1 user =
 * userService.findById(id); if (user == null) { return new
 * ResponseEntity<User1>(HttpStatus.NOT_FOUND); }
 * userService.deleteUserById(id); return new
 * ResponseEntity<User1>(HttpStatus.NO_CONTENT); }
 * 
 * @DeleteMapping(value = "/delete", headers = "Accept=application/json") public
 * ResponseEntity<User1> deleteUserQP(@RequestParam(required=false) long id) {
 * User1 user = userService.findById(id); if (user == null) { return new
 * ResponseEntity<User1>(HttpStatus.NOT_FOUND); }
 * userService.deleteUserById(id); return new
 * ResponseEntity<User1>(HttpStatus.NO_CONTENT); }
 * 
 * @PatchMapping(value = "/{id}", headers = "Accept=application/json") public
 * ResponseEntity<User1> updateUserPartially(@PathVariable("id") long
 * id, @RequestBody User1 currentUser) { User1 user = userService.findById(id);
 * if (user == null) { return new ResponseEntity<User1>(HttpStatus.NOT_FOUND); }
 * User1 usr = userService.updatePartially(currentUser, id); return new
 * ResponseEntity<User1>(usr, HttpStatus.OK); } }
 */