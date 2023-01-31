package online.market.uz.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.SmsRequestDTO;
import online.market.uz.service.SmsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sms")
@Api("SMS")
public class SmsController {
//    private final SmsService smsService;
//
//    @PutMapping("/activation")
//    public ResponseEntity<AuthResponceDTO> activation(@RequestBody SmsRequestDTO requestDTO) {
//        return ResponseEntity.ok(smsService.activation(requestDTO));
//    }
//
//    @PutMapping("/restart")
//    public ResponseEntity<String> activation(@RequestBody ProfileRestartSms restartSms) {
//        return ResponseEntity.ok(smsService.restartSms(restartSms));
//    }
}

