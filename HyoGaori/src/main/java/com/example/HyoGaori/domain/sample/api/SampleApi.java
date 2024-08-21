//package com.example.ohyeahGaori.domain.sample.api;
//
//import com.yukgaejang.inflearnclone.domain.sample.application.SampleService;
//import com.yukgaejang.inflearnclone.domain.sample.dto.SampleCreateRequest;
//import com.yukgaejang.inflearnclone.domain.sample.dto.SampleResponse;
//import com.yukgaejang.inflearnclone.domain.sample.dto.SampleUpdateRequest;
//import com.yukgaejang.inflearnclone.global.common.response.ApiResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.net.URI;
//
//@RestController
//@RequestMapping("/board/samples")
//@RequiredArgsConstructor
//public class SampleApi {
//    private final SampleService sampleService;
//
//    @GetMapping
//    public ResponseEntity<ApiResponse<Page<SampleResponse>>> getAll(@PageableDefault Pageable pageable) {
//        Page<SampleResponse> result = sampleService.getAll(pageable);
//        return ResponseEntity.ok(ApiResponse.success(result));
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ApiResponse<SampleResponse>> getById(@PathVariable("id") long id) {
//        SampleResponse result = sampleService.getById(id);
//        return ResponseEntity.ok(ApiResponse.success(result));
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> save(@Validated @RequestBody SampleCreateRequest request) {
//        Long id = sampleService.save(request);
//        return ResponseEntity.created(URI.create("/board/samples/" + id)).build();
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<Void> update(
//            @PathVariable("id")
//            long id,
//
//            @Validated
//            @RequestBody
//            SampleUpdateRequest request
//    ) {
//        sampleService.update(id, request);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
//        sampleService.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//}