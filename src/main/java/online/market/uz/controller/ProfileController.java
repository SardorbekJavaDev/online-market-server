package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.ProfileRequestDTO;
import online.market.uz.dto.response.ProfileResponseDTO;
import online.market.uz.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/profile")
@Api("Profile")
public class ProfileController {
    private final ProfileService profileService;

    @ApiOperation(value = "Create Profile", notes = "Method used for Create Profile")
    @PostMapping("")
    public ResponseEntity<ProfileResponseDTO> create(@RequestBody @Valid ProfileRequestDTO dto) {
        log.info("Profile Create {}{}", dto, ProfileController.class);
        return ResponseEntity.ok(profileService.create(dto));
    }


    @ApiOperation(value = "Update Profile", notes = "Method used for update Profile by id")
    @PutMapping("/{id}")
    public ResponseEntity<ProfileResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid ProfileRequestDTO dto) {
        log.info("Profile update {}{}", dto, ProfileController.class);
        return ResponseEntity.ok(profileService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Profile", notes = "Method used for delete Profile by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Profile delete {}{}", bId, ProfileController.class);
        return ResponseEntity.ok(profileService.delete(bId));
    }


    @ApiOperation(value = "Get Profile", notes = "Method used for Get Profile by id")
    @GetMapping("/{id}")
    public ResponseEntity<ProfileResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Profile get by id {}{}", bId, ProfileController.class);
        return ResponseEntity.ok(profileService.getById(bId));
    }

}
