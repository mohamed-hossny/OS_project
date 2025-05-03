
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "command_mapper.h"
#define MAX_COMMANDS 100
#define CMD_LEN 50

typedef struct {
    char dos[CMD_LEN];
    char linux_cmd[CMD_LEN];
} CommandMap;

CommandMap command_list[MAX_COMMANDS];
int command_count = 0;


void load_command_map(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("Error opening command map file");
        exit(1);
    }

    char line[2 * CMD_LEN];
    while (fgets(line, sizeof(line), file) && command_count < MAX_COMMANDS) {
        line[strcspn(line, "\n")] = 0;
        char *equal = strchr(line, '=');
        if (!equal) continue;

        *equal = '\0';
        strncpy(command_list[command_count].dos, line, CMD_LEN);
        strncpy(command_list[command_count].linux_cmd, equal + 1, CMD_LEN);
        command_count++;
    }

    fclose(file);

    
}


const char* translate_command(const char* dos_command) {
    for (int i = 0; i < command_count; i++) {
        if (strcmp(command_list[i].dos, dos_command) == 0) {
            return command_list[i].linux_cmd;
        }
    }
    return NULL;
}



void execute_command(const char *linux_command) {
    if (linux_command == NULL || linux_command[0] == '\0') {
        printf("Error: Empty command.\n");
        return;
    }

    int result = system(linux_command);

    if (result == -1) {
        perror("Execution failed");
    }
}


void display_commands(){
    for (int i = 0; i < command_count; i++) {
        printf("DOS: %-10s => Linux: %s\n", command_list[i].dos, command_list[i].linux_cmd);
    }
}



void show_menu() {
    printf("\n==== DOS Shell Simulator ====\n");
    printf("1. Enter DOS command\n");
    printf("2. Show available commands\n");
    printf("3. Exit\n");
    printf("=============================\n");
}


