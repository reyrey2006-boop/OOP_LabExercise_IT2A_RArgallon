/* 
   Programmer: [Imo Name]
   Date Submitted: [Date Today]
   Subject: ITC 102 – Computer Programming 2
   Activity: Fixed Partitioning using First-Fit Memory Allocation

   Description:
   This program simulates memory management using Fixed Partitioning
   with the First-Fit allocation strategy. It allocates jobs to 
   partitions, calculates internal fragmentation, and identifies jobs
   that are waiting or cannot be accommodated.
*/

import java.util.*;

class Partition {
    int size;
    int jobNo = -1;
    int jobSize = 0;
    boolean busy = false;

    Partition(int size) {
        this.size = size;
    }

    int getInternalFragmentation() {
        if (busy) {
            return size - jobSize;
        }
        return 0;
    }
}

public class FirstFitMemory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input memory size
        System.out.print("Enter total size of the memory (in KB): ");
        int totalMemory = sc.nextInt();
        if (totalMemory < 1000 || totalMemory > 2000) {
            System.out.println("Error: Memory must be between 1000 and 2000 KB.");
            return;
        }

        // Step 2: Input partitions
        System.out.print("Enter # of partitions: ");
        int n = sc.nextInt();
        Partition[] partitions = new Partition[n];
        int totalPartitionSize = 0;

        System.out.println("Enter partition sizes (100 - 500 KB each):");
        for (int i = 0; i < n; i++) {
            int pSize = sc.nextInt();
            if (pSize < 100 || pSize > 500) {
                System.out.println("Error: Partition size must be 100-500 KB.");
                return;
            }
            partitions[i] = new Partition(pSize);
            totalPartitionSize += pSize;
        }

        // Step 3: Input jobs
        System.out.print("Enter number of jobs: ");
        int m = sc.nextInt();
        int[] jobs = new int[m];
        System.out.println("Enter job sizes (in KB):");
        for (int i = 0; i < m; i++) {
            jobs[i] = sc.nextInt();
            if (jobs[i] < 1) {
                System.out.println("Error: Job size must be at least 1 KB.");
                return;
            }
        }

        // Step 4: First-Fit Allocation
        List<Integer> neverAccommodated = new ArrayList<>();
        List<Integer> waiting = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            boolean allocated = false;
            boolean canFit = false;

            for (Partition part : partitions) {
                if (jobs[j] <= part.size) {
                    canFit = true; // job can fit into at least one partition
                    if (!part.busy) {
                        part.jobNo = j + 1;
                        part.jobSize = jobs[j];
                        part.busy = true;
                        allocated = true;
                        break;
                    }
                }
            }

            if (!canFit) {
                neverAccommodated.add(j + 1);
            } else if (!allocated) {
                waiting.add(j + 1);
            }
        }

        // Step 5: Display Output
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Memory Table : Fixed Partitioning with First-Fit");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-22s | %-14s | %-17s | %-8s | %-23s%n",
                "Partition #", "Memory Partition Size", "Process/Job #", "Process/Job Size", "Status", "Internal Fragmentation");

        int totalUsed = 0;
        int totalIF = 0;

        for (int i = 0; i < n; i++) {
            Partition p = partitions[i];
            String status = p.busy ? "Busy" : "Free";
            String jobNo = p.busy ? String.valueOf(p.jobNo) : "-";
            String jobSize = p.busy ? String.valueOf(p.jobSize) : "-";
            int IF = p.getInternalFragmentation();
            totalIF += IF;
            if (p.busy) totalUsed += p.size;

            System.out.printf("%-12d | %-22d | %-14s | %-17s | %-8s | %-23d%n",
                    (i + 1), p.size, jobNo, jobSize, status, IF);
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Memory: " + totalPartitionSize);
        System.out.println("Total Used:   " + totalUsed);
        System.out.println("Total IF:     " + totalIF);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        for (int job : neverAccommodated) {
            System.out.println("Process/Job " + job + ": Never be Accommodated");
        }
        for (int job : waiting) {
            System.out.println("Process/Job " + job + ": Waiting");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
}
