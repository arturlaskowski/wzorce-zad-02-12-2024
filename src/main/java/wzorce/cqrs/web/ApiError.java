package wzorce.cqrs.web;

import org.springframework.http.HttpStatus;

import java.time.Instant;

record ApiError(HttpStatus status, String message, Instant timestamp) {
}