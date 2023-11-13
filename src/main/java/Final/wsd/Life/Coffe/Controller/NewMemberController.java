//package Final.wsd.Life.Coffe.controller;
//
//import Final.wsd.Life.Coffe.member.MemberRepo;
//import Final.wsd.Life.Coffe.member.newMember;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/members")
//public class NewMemberController {
//
//    @Autowired
//    private MemberRepo repo;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @PostMapping
//    public ResponseEntity<ResponData<?>> createOne(@RequestBody MemberRequest memberRequest){
//
//        ResponData<MemberRespon> respon = new ResponData<>();
//        newMember member = modelMapper.map(memberRequest, newMember.class);
//        member = repo.save(member);
//        respon.setStatus(true);
//        respon.getMessages().add("Member saved");
//        respon.setPayload(modelMapper.map(member,MemberRespon.class));
//        return ResponseEntity.ok(respon);
//    }
//@GetMapping
//    public ResponseEntity <ResponData<List<MemberRespon>>> findAll(){
//        ResponData<List<MemberRespon>> respon = new ResponData<>();
//        List<MemberRespon> listMember = new ArrayList<>();
//        repo.findAll().forEach(member ->{
//            listMember.add(modelMapper.map(member,MemberRespon.class));});
//        respon.setStatus(true);
//        respon.setPayload(listMember);
//        return ResponseEntity.ok(respon);
//
//    }
//}
