from collections import Counter

def solution(k, tangerine) :
    counts = Counter(tangerine)

    sorted_counts = sorted(counts.values(), reverse = True)

    result = 0
    box_size = 0

    for count in sorted_counts :
        result += 1
        box_size += count

        if box_size >= k :
            break

    return result