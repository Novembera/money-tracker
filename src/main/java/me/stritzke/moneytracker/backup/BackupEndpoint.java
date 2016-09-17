package me.stritzke.moneytracker.backup;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class BackupEndpoint {
  private final BackupService backupService;

  @RequestMapping(method = RequestMethod.GET, value = "backup")
  public ResponseEntity<?> doBackup() {
    Backup backup = backupService.create();
    return ResponseEntity.ok(backup);
  }

  @RequestMapping(method = RequestMethod.POST, value = "restore")
  public ResponseEntity<?> doRestore() {
    return ResponseEntity.notFound().build();
  }
}
