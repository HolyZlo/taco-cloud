package tacos.api;

//@RestController
//@RequestMapping(path = "/api/tacos",
//        produces = "application/json")
//@CrossOrigin(origins = "http://tacocloud:8080")
public class TacoController {
//    private TacoRepository tacoRepo;
//
//    public TacoController(TacoRepository tacoRepo) {
//        this.tacoRepo = tacoRepo;
//    }
//
//    @GetMapping(params = "recent")
//    public Iterable<Taco> recentTacos() {
//        PageRequest page = PageRequest.of(
//                0, 12, Sort.by("createdAt").descending());
//        return tacoRepo.findAll(page);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
//        Optional<Taco> optTaco = tacoRepo.findById(id);
//        if (optTaco.isPresent()) {
//            return new ResponseEntity<>(optTaco.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//    }
//    @PostMapping(consumes="application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Taco postTaco(@RequestBody Taco taco) {
//        return tacoRepo.save(taco);
//    }
}
